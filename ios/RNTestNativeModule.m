
#import "RNTestNativeModule.h"

@implementation RNTestNativeModule

RCT_EXPORT_MODULE();


RCT_REMAP_METHOD(getAppVersion,
                 findEventsWithResolver:(RCTPromiseResolveBlock)resolve
                 rejecter:(RCTPromiseRejectBlock)reject)
{
    NSString *version = [[[NSBundle mainBundle] infoDictionary] objectForKey:@"CFBundleShortVersionString"];
    resolve(version);

};

@end
